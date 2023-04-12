package com.controller;

import java.io.BufferedOutputStream; 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.hibernate.cache.internal.CollectionCacheInvalidator;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.SecurityContextProvider;
import org.springframework.beans.factory.support.SimpleSecurityContextProvider;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import net.bytebuddy.asm.Advice.This;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private CategoryDao dao;
	@Autowired
	private ProductDao pao;

	@Autowired
	private SupplierDao sao;

	@Autowired
	private UserDao uao;
	
	@Autowired
	private CartDao cartdao;
	
	@Autowired
	private OrderDao orderdao;

	@RequestMapping("/data")
	public String handle() {

		UserDetail u = new UserDetail();

		u.setUserName("Manuddin");
		u.setPassword("@34err");
		u.setEnabled(true);
		u.setRole("Role_User");
		u.setCutomerNumber("Akash");
		u.setCustomerAddr("up");

		uao.registerUser(u);
		System.out.println("ok");

		return "index";
	}

	@RequestMapping("/")
	public String Header() {

		return "Header";
	}

	@RequestMapping("/home")
	public String home() {

		return "index";
	}

	@RequestMapping("/login")
	public String ShowLogin() {

		return "Login";
	}

	@RequestMapping("/register")
	public String showRegister() {

		return "Register";
	}

	@RequestMapping("/aboutus")
	public String ShowAboutUs() {

		return "AboutUS";
	}

	@RequestMapping("/contactus")
	public String ShowContactUs() {

		return "ContactUS";
	}

	@RequestMapping("/category")
	public String ShowCategory(Model m) {

		List<Category> listcate = dao.listCategory();

		m.addAttribute("ListCotegories", listcate);

		return "Category";
	}

	@RequestMapping(value = "/AddCategory", method = RequestMethod.POST)
	public String addCategory(Model m, @RequestParam("catName") String categoryName,
			@RequestParam("catDesc") String categoryDesc) {

		Category cate = new Category();
		cate.setCategoryName(categoryName);
		cate.setCategoryDesc(categoryDesc);

		dao.addCategory(cate);

		List<Category> listcate = dao.listCategory();

		
		m.addAttribute("ListCotegories", listcate);

		return "Category";
	}

	@RequestMapping(value = "/UpdateCategory", method = RequestMethod.POST)
	public String updateCategory(Model m, @RequestParam("catId") int categoryId,
			@RequestParam("catName") String categoryName, @RequestParam("catDesc") String categoryDesc) {

		Category cate = new Category();
		cate.setCategoryID(categoryId);
		cate.setCategoryName(categoryName);
		cate.setCategoryDesc(categoryDesc);

		dao.updateCategory(cate);

		List<Category> listcate = dao.listCategory();

		m.addAttribute("ListCotegories", listcate);

		return "Category";
	}

	@RequestMapping(value = "/deleteCategory/{categoryId}")
	public String deleteCategory(Model m, @PathVariable("categoryId") int categoryId) {

		Category category = dao.getCategory(categoryId);
		dao.deleteCategory(category);

		List<Category> listcate = dao.listCategory();

		m.addAttribute("ListCotegories", listcate);

		return "Category";
	}

	@RequestMapping(value = "/editCategory/{categoryId}")
	public String editCategory(Model m, @PathVariable("categoryId") int categoryId) {

		Category category = dao.getCategory(categoryId);

		m.addAttribute("category", category);

		return "UpdateCategory";
	}

	@RequestMapping("/product")
	public String showProduct(Model m) {
		
		
		Product product=new Product();
		
		m.addAttribute(product);
		List<Product> listProducts=pao.listProduct();
		m.addAttribute("ProductList", listProducts);
		//m.addAttribute("categroyList", this.getCategories());
				
		return "Product";
		
	}
	@RequestMapping(value="/InsertProduct",method=RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product") Product product,@RequestParam("pimage") MultipartFile filedet,Model m) {
		
		pao.addProduct(product);
		Product product1=new Product();
		m.addAttribute(product1);
		String imagepath="D:\\hibernate\\Ecommerce\\src\\main\\webapp\\resources\\images\\";
		
		imagepath=imagepath+String.valueOf(product.getProductId()+".jpg");
		
		File image=new File(imagepath);
		
		if(!filedet.isEmpty()) {
			
			try {
				byte buff[]=filedet.getBytes();
				FileOutputStream fos=new FileOutputStream(image);
				
				BufferedOutputStream bs=new BufferedOutputStream(fos);
				bs.write(buff);
				bs.close();
			}catch(Exception e) {
				m.addAttribute("errorInfo", "Exception Occured during image Uploading : "+e.getMessage());
				
			}
			
		}else {
			
			m.addAttribute("errorInfo","Problem Occured during Image Uploading");
		}
		
		List<Product> listProducts=pao.listProduct();
		m.addAttribute("productList", listProducts);
		
		
		return "Product";
	}
	
	@RequestMapping(value="/UpdateProduct",method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product")Product product,Model m) {
		
		pao.updateProduct(product);
		
		Product product1=new Product();
		m.addAttribute(product1); 
		List<Product> listproducts=pao.listProduct();
		m.addAttribute("productList", listproducts);
		return "Product";
		
	}
	
	@RequestMapping(value="/deleteProduct/{productId}",method=RequestMethod.GET)
	public String deleteProduct(@PathVariable("productId") int productId,Model m) {
		
		Product product=pao.getProduct(productId);
		pao.deleteProduct(product);
		
		
		Product product1=new Product();
		m.addAttribute(product1);
		List<Product> listproducts=pao.listProduct();
		m.addAttribute("productList", listproducts);
		return "Product";
		
	}
	@RequestMapping("/editProduct/{productId}")
	public String editProduct(@PathVariable("productId") int productId, Model m) {
		
		Product product=pao.getProduct(productId);
		m.addAttribute( product);
		return "UpdateProduct";
		
	}
	
	
	
	@RequestMapping(value="/productDisplay" ,method=RequestMethod.GET)
	public String displayAllProduct(Model m) {
		
		List<Product> listproducts=pao.listProduct();
		m.addAttribute("productList", listproducts);
		
		
		return"ProductDisplay";
	}
	
	
	@RequestMapping(value="/totalProductDisplay/{productId}")
	public String totalProductDisplay(@PathVariable("productId") int productId,Model m) {
		
		Product product=pao.getProduct(productId);
		m.addAttribute("product", product);
		
		
		
		return"TotalProductDisplay";
	}
	
	@RequestMapping("/cart")
	public String ShowCart(Model m, HttpSession session) {
		
		String username=(String)session.getAttribute("username");
		
		List<CartItem> cartItemList=cartdao.listCartItems(username);
		
		m.addAttribute("cartItemList", cartItemList);
		m.addAttribute("grandToal", this.getGrandTotal(cartItemList));
			
		
		return "Cart";
	}
	
	@RequestMapping("/addToCart/{productId}")
	public String addToCart(@PathVariable("productId") int productId,@RequestParam("quantity") int quantity,HttpSession session,Model m) {
		
		Product product=pao.getProduct(productId);
		String username=(String)session.getAttribute("username");
		
		CartItem cartItem=new CartItem();
		cartItem.setProductId(product.getProductId());
		cartItem.setProductName(product.getProductName());
		
		cartItem.setQuantity(quantity);
		cartItem.setPrice(product.getPrice());
		cartItem.setPaymentStatus("NP");
		cartItem.setUsername(username);
		cartdao.addCartItem(cartItem);
		List<CartItem> cartItemList=cartdao.listCartItems(username);
		
		m.addAttribute("cartItemList", cartItemList);
		
		m.addAttribute("grandTotal",this.getGrandTotal(cartItemList));
		
		return"Cart";
		
		
		
	}
	
	@RequestMapping("/updateCartItem/{cartItemId}")
public String addToCart(@PathVariable("cartItemId") int cartItemId,@RequestParam("quantity") int quantity,Model m,HttpSession session) {
		
		CartItem cartItem=cartdao.getCartItem(cartItemId);
		cartItem.setQuantity(quantity);
		cartdao.updateCartItem(cartItem);
		
		String username=(String)session.getAttribute("Username");
		
		List<CartItem> cartItemList=cartdao.listCartItems(username);
		m.addAttribute("cartItemList", cartItemList);
		m.addAttribute("grandTotal", this.getGrandTotal(cartItemList));
		
		return"Cart";
		
		
		
	}
	
	@RequestMapping("/deleteCartItem/{cartItemId}")
	public String deleteCartItem(@PathVariable("cartItemId") int cartItemId, Model m, HttpSession session) {
		
		CartItem cartItem=cartdao.getCartItem(cartItemId);
		cartdao.deleteCartItem(cartItem);
		String username=(String)session.getAttribute("Username");
		
		List<CartItem> cartItemList=cartdao.listCartItems(username);
		m.addAttribute("cartItemList", cartItemList);
		m.addAttribute("grandTotal", this.getGrandTotal(cartItemList));
		
		
		return "Cart";
	}
	
	public int getGrandTotal(List<CartItem> cartList) {
		
		int grandTotal=0,count=0;
		
		while(count<cartList.size()) {
			grandTotal=grandTotal+(cartList.get(count).getQuantity()*cartList.get(count).getPrice());
			count++;
			
		}
		
		return grandTotal;
		
		
	}
	
	
	@RequestMapping(value="/username")
	public String showUserName(Model m , HttpSession session) {
		
		List<Product> listProducts=pao.listProduct();
		m.addAttribute("productList", listProducts);
		
		return "UserName";
	}
	
	@RequestMapping(value="/login_success")
	public String loginCheck(Model m , HttpSession session) {
		
		
		
		String page="";
		boolean loggedIn=false;
		
		SecurityContext securitycontext = SecurityContextHolder.getContext();
		org.springframework.security.core.Authentication authentication = securitycontext.getAuthentication();
		
		String username=authentication.getName();
		Collection<GrantedAuthority> roles=(Collection<GrantedAuthority>)authentication.getAuthorities();
		
		for(GrantedAuthority role:roles) {
			
			session.setAttribute("roles", role.getAuthority());
			if(role.getAuthority().equals("Roles")) {
				
				loggedIn=true;
				page="AdminHome";
				session.setAttribute("loggedIn", loggedIn);
				session.setAttribute("username", username);
				
			}else {
				m.addAttribute("pageInfo", "User Home");
				List<Product> listProducts=pao.listProduct();
				m.addAttribute("productList", listProducts);
				loggedIn=true;
				page="UserHome";
				
				session.setAttribute("loggedIn", loggedIn);
				session.setAttribute("username", username);
				
			}
		}
		
	return page;		
		
	}
	
	@RequestMapping("/checkOut")
	public String checkOut(Model m,HttpSession session) {
		
		//String username=(String)session.getAttribute("Username");
		
		
		List<CartItem> cartItem=cartdao.listCartItems("UsrName");
		
		m.addAttribute("cartItemList", cartItem);
		m.addAttribute("grandTotal", this.getGrandTotal(cartItem));
		UserDetail userDetails=uao.getUser("Manuddin");
		
		String address=userDetails.getCustomerAddr();
		m.addAttribute("addr", address);
		return "OrderConfirm";
		
	}
	
	@RequestMapping(value="/UpdateAddr",method=RequestMethod.POST)
	public String UpdateAddr(@RequestParam("addr") String addr,Model m,HttpSession session) {
		
		String username=(String)session.getAttribute("Username");
		List<CartItem> cartItemsList=cartdao.listCartItems(username);
		
		m.addAttribute("cartItemList", cartItemsList);
		m.addAttribute("grandTotal", this.getGrandTotal(cartItemsList));
		UserDetail userdetails=uao.getUser("Manuddin");
		userdetails.setCustomerAddr(addr);
		uao.updateUser(userdetails);
		String address=userdetails.getCustomerAddr();
		m.addAttribute("addr", address);
		return "OrderConfirm";
		
	}
	
	@RequestMapping(value="/payment")
	public String paymentPage() {
		
		return "Payment";
	}
	@RequestMapping(value="perform_got")
	public String got(@RequestParam("username") String username,@RequestParam("password") String password,Model m) {
		
		UserDetail userdetail =uao.getUser(username);
		
		if(userdetail.getRole().equals("Role_User")) {
			
			m.addAttribute("username", username);
			List<Product> listproducts=pao.listProduct();
			m.addAttribute("productList", listproducts);
			
			
			return "ProductDisplay";
		}else {
			m.addAttribute("username", username);
			return "Category";
			
		}
		
		
		
		
	}
	

	@RequestMapping("/homeregistration")
	public String HomeForRegistration(@ModelAttribute("UserDetail") UserDetail userdetail) {
		
		uao.registerUser(userdetail);

		return "Home";
	}
	
	@RequestMapping("/adminhome")
	public String Home() {
		
		

		return "Home";
	}
	
	
	
	@RequestMapping("/adminhomelogout")
	public String HomeForLogOut() {
		
		

		return "Home";
	}
	
	@RequestMapping(value="/receipt",method=RequestMethod.POST)
	public String generateReceipt(@RequestParam("rd") String rd,Model m,HttpSession session) {
		String username=(String)session.getAttribute("Username");
		OrderDetails orderDetails=new OrderDetails();
		orderDetails.setOrderDate(new Date());
		orderDetails.setShippingAddr(uao.getUser("Manuddin").getCustomerAddr());
		orderDetails.setTrans(rd);
		orderDetails.setUsername("Manuddin");
		
		List<CartItem> cartItem=cartdao.listCartItems("Manuddin");
		m.addAttribute("cartItemList", cartItem);
		m.addAttribute("grandTotal", this.getGrandTotal(cartItem));
		UserDetail userDetails=uao.getUser("Manuddin");
		m.addAttribute("date", new Date());
		orderDetails.setTotalAmount(this.getGrandTotal(cartItem));
		
		orderdao.saveOrder(orderDetails);
//		m.addAttribute("id", orderDetails.getOrderID());
		m.addAttribute("addr", orderDetails.getShippingAddr());
	//orderdao.updateOrder("Manuddin");
		
		m.addAttribute("orderDetail", orderDetails);

		return "Receipt";
	}
	
	@RequestMapping("//perform_logout")
	public String Logout() {

		
		
		return "Logout";
	}
	
	
	
	
	
}
