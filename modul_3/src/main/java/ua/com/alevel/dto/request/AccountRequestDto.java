package ua.com.alevel.dto.request;

import ua.com.alevel.dto.RequestDto;

public class AccountRequestDto extends RequestDto {

    private String name;
    private Long userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
