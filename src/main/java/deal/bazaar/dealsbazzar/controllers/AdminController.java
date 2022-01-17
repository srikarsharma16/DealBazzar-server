package deal.bazaar.dealsbazzar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deal.bazaar.dealsbazzar.models.Admin;
import deal.bazaar.dealsbazzar.models.Category;
import deal.bazaar.dealsbazzar.models.ResponseData;
import deal.bazaar.dealsbazzar.services.AdminService;
import deal.bazaar.dealsbazzar.services.CategoryService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:3000" })
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/add")
    public Admin addAdmin(@RequestBody Admin admin){
        return adminService.addAdminUser(admin);
    }

    @PostMapping("/login")
    public String login(@RequestBody Admin admin){
        return  adminService.validateAdminUser(admin.getUserName(), admin.getPassword())
                ?"Login successfully.."
                :"bad credential please retry again !";
    }
}
