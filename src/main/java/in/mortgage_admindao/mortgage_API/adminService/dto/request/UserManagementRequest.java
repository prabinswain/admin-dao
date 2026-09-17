package in.mortgage_admindao.mortgage_API.adminService.dto.request;

import lombok.Data;

@Data
public class UserManagementRequest {

    private SearchCriteria searchCriteria;
    private int startRecord;
    private int pageSize;
    private String userGroup;

}
