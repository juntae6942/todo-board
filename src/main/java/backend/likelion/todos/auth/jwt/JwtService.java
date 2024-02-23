package backend.likelion.todos.auth.jwt;

import static java.util.concurrent.TimeUnit.DAYS;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;

// TODO [2단계] 서비스에 대한 컴포넌트를 등록해주세요.
// TODO [2단계] 필요한 필드 변수에 대한 Dependency Injection을 위한 annotation을 추가해주세요. 혹은 생성자를 사용해도 됩니다.
public class JwtService {

    private final ObjectMapper objectMapper;
    private final long accessTokenExpirationDayToMills;
    private final Algorithm algorithm;

    public JwtService(JwtProperty jwtProperty) {
        this.objectMapper = new ObjectMapper();
        this.accessTokenExpirationDayToMills = MILLISECONDS.convert(jwtProperty.accessTokenExpirationDay(), DAYS);
        // TODO [2단계] jwtProperty의 secretKey 를 HMAC512 로 암호화합니다.
        // TODO [2단계] 이를 위해 com.auth0.jwt.algorithms.Algorithm 의 적절한 메서드를 사용하세요.

    }

    public String createToken(Long memberId) {
        return JWT.create()
                .withExpiresAt(new Date(
                        // TODO [2단계] 토큰의 만료일을 설정합니다. 만료일은 설정한 액세스 토큰 만료 기간(밀리초) + 현재시간(밀리초)
                        // TODO [2단계] 힌트는 System.currentTimeMillis에 대해서 알아보세요

                ))
                .withIssuedAt(new Date())  // 현재 시간을 발급일로 설정합니다.

                // TODO [2단계] memberId 클레임을 설정합니다. 값은 인자로 주어진 회원 Id로 설정합니다.
                .withClaim()
                .sign(); // TODO [2단계] 알고리즘으로 서명합니다.
    }

    public Long extractMemberId(String token) {
        try {
            return JWT.require(algorithm) // 주어진 토큰이 우리가 설정한 secretkey로 서명되었는지 확인을 위해 필요합니다.
                    .build()
                    .verify(token) // 토큰이 유효한지 검사합니다.
                    .getClaim() // TODO [2단계] 토큰에서 회원 Id 정보를 담은 클래임을 가져옵니다.
                    .asLong();
        } catch (JWTVerificationException e) {
            // TODO [2단계] "유효하지 않은 토큰입니다."라는 문구로 오류를 처리하세요, throw 할 예외는 test code를 참고하세요

        }
    }
}
