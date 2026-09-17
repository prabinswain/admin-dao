package in.mortgage_admindao.mortgage_API.adminService.controller;

import in.mortgage_admindao.mortgage_API.adminService.dto.request.UserManagementRequest;
import in.mortgage_admindao.mortgage_API.adminService.dto.response.ApiResponse;
import in.mortgage_admindao.mortgage_API.adminService.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/userMgmnt")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private enum CONFIGURED_ROLE { UW, RCS;}

    private final AdminService userService;

    /***
     * to get List of user
     */
    @PostMapping("/pipeline")
    public ResponseEntity<ApiResponse<?>> getUserList(@RequestBody UserManagementRequest userManagementRequest){
         return userService.getUsrManagementDet(userManagementRequest);
    }

    /***
     * Used to track changes made by admin user in field configuration screen of admin portal
     */
    @PostMapping(value = "/trackFiledConfigurationChange" , produces = MediaType.APPLICATION_JSON_VALUE)
    public String insertIntoAudittrial(){
       return null;
    }

    @PostMapping("/addOrEdit")
    public void addOrEditUserDet(){

    }




}
