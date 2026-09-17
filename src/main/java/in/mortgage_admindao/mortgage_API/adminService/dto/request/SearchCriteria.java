package in.mortgage_admindao.mortgage_API.adminService.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class SearchCriteria {

    private String userSearch;
    private String roleSearch;
    private String managerSearch;
    private List<String> filterKey;

}
