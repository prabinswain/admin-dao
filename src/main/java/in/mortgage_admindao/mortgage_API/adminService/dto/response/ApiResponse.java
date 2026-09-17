package in.mortgage_admindao.mortgage_API.adminService.dto.response;

public record ApiResponse<T>(
        String status,
        String message,
        T data
) {
}
