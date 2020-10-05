package com.thoughtworks.rslist.dto;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RsEventDto {

    private String rsEventName;
    private String rsEventKeyword;

    private @Valid UserDto user;

    public RsEventDto(String rsEventName, String rsEventKeyword, UserDto user) {
        this.rsEventName = rsEventName;
        this.rsEventKeyword = rsEventKeyword;
        this.user = user;
    }

    public String getRsEventName() {
        return rsEventName;
    }

    public String getRsEventKeyword() {
        return rsEventKeyword;
    }

    public void setRsEventName(String rsEventName) {
        this.rsEventName = rsEventName;
    }

    public void setRsEventKeyword(String rsEventKeyword) {
        this.rsEventKeyword = rsEventKeyword;
    }

    @JsonIgnore
    public UserDto getUser() {
        return user;
    }

    @JsonProperty
    public void setUser(UserDto user) {
        this.user = user;
    }
}
