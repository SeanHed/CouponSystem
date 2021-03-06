package main;

import java.time.LocalDate;

import facade.AdminFacade;
import facade.CompanyFacade;
import facade.CustomerFacade;
import facade.clientType;
import javabeans.Company;
import javabeans.Coupon;
import javabeans.CouponType;
import javabeans.Customer;

@SuppressWarnings("unused")
public class Testing {

	public static void main(String[] args) throws Exception {
		System.out.println("Start.");
		CouponSystem.getInstance().startCouponsUpdater();

		Database database = new Database();
//		 database.dropCompanyCouponTable();
//		 database.dropCustomerCouponTable();
//		 database.dropCompanysTable();
//		 database.dropCustomersTable();
//		 database.dropCouponsTable();
		// database.createCompanysTable();
		// database.createCouponsTable();
		// database.createCustomersTable();
		// database.createCompanysCouponTable();
		// database.createCustomerCouponTable();

		Coupon coupon1 = new Coupon("Seventh Popcorn Free", LocalDate.now(), LocalDate.of(2019, 10, 1), 5,
				CouponType.FOOD, "By YesPlanet", 15, "");
		Coupon coupon2 = new Coupon("Free Popcorn with movie", LocalDate.now(), LocalDate.of(2019, 10, 1), 5,
				CouponType.FOOD, "By YesPlanet", 15, "");
		Coupon coupon3 = new Coupon("Free Tent with Lederman swiss knife", LocalDate.now(), LocalDate.of(2019, 10, 1),
				5, CouponType.CAMPING, "By Hagor", 15, "");
		Coupon coupon4 = new Coupon("Bonus ChickenWing with takeout order", LocalDate.now(), LocalDate.of(2019, 10, 1),
				5, CouponType.FOOD, "By Japanika", 15, "");
//		Customer customer1 = new Customer("Sean", "1234");
//		Customer customer2 = new Customer("Michael", "1234");
//		Customer customer3 = new Customer("Tomer", "1234");
//		Customer customer4 = new Customer("Kobi", "1234");
//		Customer customer5 = new Customer("Maya", "1234");
//		Customer customer6 = new Customer("Aurora", "1234");
//		Company company1 = new Company("Yesplanet", "1234", "Yesplanet@gmail.com");
//		Company company2 = new Company("Hagor", "1234", "Hagor@gmail.com");
//		Company company3 = new Company("Japanika", "1234", "Japanika@gmail.com");
//		AdminFacade adminFacade = new AdminFacade();
//		CompanyFacade companyFacade = new CompanyFacade();
//		CustomerFacade customerFacade = new CustomerFacade();

		//CouponSystem.getInstance().login("admin", "1234", clientType.ADMINISTRATOR);
		// adminFacade.createCompany(company1);
		// adminFacade.createCompany(company2);
		// adminFacade.createCompany(company3);
		// adminFacade.createCustomer(customer1);
		// adminFacade.createCustomer(customer2);
		// adminFacade.createCustomer(customer3);
		// adminFacade.createCustomer(customer4);
		// adminFacade.createCustomer(customer5);
		// adminFacade.createCustomer(customer6);
		// companyFacade.createCoupon(coupon1, company1.getId());
		// companyFacade.createCoupon(coupon2, company1.getId());
		// companyFacade.createCoupon(coupon3, company2.getId());
		// companyFacade.createCoupon(coupon4, company3.getId());

		// companyFacade.login("Japanika", "1234", clientType.COMPANY);
		//
		// companyFacade.getAllCompanies();
		// System.out.println(companyFacade.getAllCoupons());
		// companyFacade.getCouponByPrice(10);
		// companyFacade.getCouponByType(CouponType.FOOD);
		// companyFacade.getCoupon(2);
		// companyFacade.getCouponByDate(LocalDate.now());

		// companyFacade.removeCoupon(coupon1);
		// customerFacade.purchaseCoupon(customer1, coupon4);
		// customerFacade.purchaseCoupon(customer1, coupon3);

//		CustomerFacade customerFacade2 = (CustomerFacade) CouponSystem.getInstance().login("Sean", "1234", clientType.CUSTOMER);
//
//		System.out.println(customerFacade2.getAllCustomers());
//		System.out.println(customerFacade2.getCustomer(1));
//		System.out.println(customerFacade2.getAllPurchasedCouponsByPrice(100));
//		 customerFacade.login("Michael", "1234", clientType.CUSTOMER);
//
//		System.out.println(customerFacade.getAllPurchasedCouponsByPrice(10));
//		System.out.println(customerFacade.getAllPurchasedCouponsByType(CouponType.FOOD));
//		System.out.println(customerFacade.getAllPurchasedCouponsByType(CouponType.CAMPING));

		// System.out.println(customerFacade.getAllPurchasedCouponsByPrice(100));

		// System.out.println(adminFacade.getAllCoupons());
		//
//		  adminFacade.getAllCompanies();
//		  adminFacade.getAllCustomers();
//		  System.out.println(adminFacade.getAllCoupons());
		//
		 //companyFacade.login("Yesplanet", "1234", clientType.COMPANY);
		// // companyFacade.removeCoupon(coupon1);
		//
		// System.out.println(companyFacade.getAllCoupons());
		//
		// // customerFacade.purchaseCoupon(customer1, coupon1);
		// // customerFacade.purchaseCoupon(customer1, coupon1);
		// // System.out.println(customerFacade.getCouponsPurchaseHistory());
		// //
		// // customerFacade.purchaseCoupon(customer2, coupon1);
		//
		// // customerFacade.login("Tomer", "1234", clientType.CUSTOMER);
		// // customerFacade.purchaseCoupon(customer3, coupon1);
		// //
		// // customerFacade.login("Kobi", "1234", clientType.CUSTOMER);
		// // customerFacade.purchaseCoupon(customer4, coupon1);
		// customerFacade.login("Sean", "1234", clientType.CUSTOMER);
		// System.out.println(customerFacade.getCouponsPurchaseHistory());
		//
		// //
		// customerFacade.login("Maya", "1234", clientType.CUSTOMER);
		// // customerFacade.purchaseCoupon(customer5, coupon1);
		//
		// System.out.println(customerFacade.getCouponsPurchaseHistory());
		//
		// customerFacade.login("Aurora", "1234", clientType.CUSTOMER);
		// //customerFacade.purchaseCoupon(customer6, coupon1);
		// System.out.println(customerFacade.getCouponsPurchaseHistory());

		// System.out.println(customerFacade.getCouponsPurchaseHistory());
		//
		// customerFacade.purchaseCoupon(customer2, coupon1);
		// System.out.println(customerFacade.getCouponsPurchaseHistory());

		CouponSystem.getInstance().stopTask();
		// ConnectionPoolBlockingQueue.getInstance().shutDownConnections();
		//ConnectionPoolBlockingQueue.getInstance().closeAllConnections();
		// ConnectionPool.getInstance().closeAllConnections();

		System.out.println("End.");

	}

}
