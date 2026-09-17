package in.mortgage_admindao.mortgage_API.adminService.service;

import in.mortgage_admindao.mortgage_API.adminService.dto.request.UserManagementRequest;
import in.mortgage_admindao.mortgage_API.adminService.dto.response.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface AdminService {

    public ResponseEntity<ApiResponse<?>> getUsrManagementDet(UserManagementRequest managementRequest);

}
