package com.example.userservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidateTokenRequestDto {
    public Long userId;
    public String token;
}
/**
 * eyJhbGciOiJIUzI1NiJ9.e2NyZWF0ZWRBdD1XZWQgSmFuIDI0IDA3OjU0OjE4IElTVCAyMDI0LCByb2xlcz1bXSwgZW1haWw9aHJpdGlrQGdtYWlsLmNvbX0.BVTuezXSeduD0TlrK-J6xO8zwxhOoZESGZ0YT16jol4
 */
