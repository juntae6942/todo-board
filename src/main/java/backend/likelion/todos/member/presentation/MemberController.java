package backend.likelion.todos.member.presentation;

import backend.likelion.todos.auth.jwt.JwtService;
import backend.likelion.todos.member.application.MemberService;
import backend.likelion.todos.member.presentation.request.MemberSignupRequest;
import backend.likelion.todos.member.presentation.response.LoginResponse;
import jakarta.validation.Valid;
import java.net.URI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/members")
@RestController
public class MemberController {

    private final MemberService memberService;
    private final JwtService jwtService;
    @PostMapping
    public ResponseEntity<Void> signup(
            @Valid @RequestBody MemberSignupRequest request
    ) {
        Long memberId = memberService.signup(
                request.username(),
                request.password(),
                request.nickname(),
                request.profileImageUrl()
        );
        return ResponseEntity.created(URI.create("/members/" + memberId))
                .build();
    }

    // TODO [2단계] [ POST , /members/login ] 로 들어오는 요청에 대해 동작해야 합니다.
    public ResponseEntity<LoginResponse> login(
            // TODO [2단계] Json 타입으로 들어오는 request Body를 매핑합니다.

    ) {
        // TODO [2단계] 회원 서비스를 사용하여 로그인을 진행합니다.
        // TODO [2단계] 로그인 결과 반환된 Id를 가지고 Jwt(AccessToken)를 생성합니다.
        // TODO [2단계] 생성한 accessToken을 LoginResponse로 감싸 반환합니다.
        return null;
    }
}
