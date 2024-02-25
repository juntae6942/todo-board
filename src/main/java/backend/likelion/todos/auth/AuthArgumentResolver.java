package backend.likelion.todos.auth;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

// TODO [3단계] Component로 지정하여 Scanner가 인식하게 한다.
public class AuthArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        // TODO [3단계] parameter가 Auth 애노테이션을 달고 있으며, Long 타입의 파라미터인 경우에 지원한다
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter,
                                  ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest,
                                  WebDataBinderFactory binderFactory) throws Exception {
        // TODO [3단계] webRequest는 요청 정보를 담고있다. Authorization 헤더에 설정된 값을 가져오자.
        // TODO [3단계] 가져온 값은 [Bearer accessToken] 형식이어야 한다. 해당 값이 존재하고, Bearer 로 시작하는지 확인한 뒤,
        // TODO [3단계] 올바르다면 [Bearer ] 을 제외한 부분만을 가져온다. 해당 부분이 AccessToken이 되며 이를 반환하자.
        // TODO [3단계] 힌트를 주자면 헤더에서 가져온 JWT 토큰이 비어있는지 확인할 때는 StringUtils를 사용하면 편하다.

        // TODO [3단계] 만약 헤더 값이 없거나, [Bearer accessToken] 형식이 아닌 경우 아래 예외가 발생된다. "로그인 후 접근할 수 있습니다."
        return null;
    }
}
