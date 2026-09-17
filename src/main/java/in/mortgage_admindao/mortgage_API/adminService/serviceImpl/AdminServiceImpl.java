package in.mortgage_admindao.mortgage_API.adminService.serviceImpl;

import in.mortgage_admindao.mortgage_API.adminService.controller.UserController;
import in.mortgage_admindao.mortgage_API.adminService.dto.request.UserManagementRequest;
import in.mortgage_admindao.mortgage_API.adminService.dto.response.ApiResponse;
import in.mortgage_admindao.mortgage_API.adminService.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {


    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Override
    public ResponseEntity<ApiResponse<?>> getUsrManagementDet(UserManagementRequest managementRequest) {

        String roleFilter = roleService.buildRoleFilter(managementRequest.getUserGroup(),
                                                        managementRequest.getSearchCriteria().getRoleSearch());

        String statusFilter = statusService.buildStatusFilter(managementRequest.getSearchCriteria().getFilterKey());
        return adminDao.getUserManagementDet();
    }
}
