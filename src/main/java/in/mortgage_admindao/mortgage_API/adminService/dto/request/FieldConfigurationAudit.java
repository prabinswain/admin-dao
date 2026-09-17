package in.mortgage_admindao.mortgage_API.adminService.dto.request;


import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Objects;

@Getter
@Setter
public class FieldConfigurationAudit {

    private String operationType;
    private String keyName;
    private String code;
    private String value;

    private Map<String , Objects> oldData;
    private Map<String , Objects> newData;


}
