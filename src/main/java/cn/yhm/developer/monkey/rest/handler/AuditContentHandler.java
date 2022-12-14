package cn.yhm.developer.monkey.rest.handler;

import cn.yhm.developer.ecology.rest.handler.GatewayHandler;
import cn.yhm.developer.monkey.model.request.AuditContentRequest;
import cn.yhm.developer.monkey.model.response.AuditContentResponse;
import cn.yhm.developer.monkey.service.ContentService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * 审计内容处理程序
 *
 * @author victor2015yhm@gmail.com
 * @since 2022-10-11 07:30:45
 */
@Transactional(rollbackFor = Exception.class)
@Component
public class AuditContentHandler implements GatewayHandler<AuditContentRequest, AuditContentResponse> {

    @Resource
    private ContentService contentService;

    @Override
    public AuditContentResponse handle(AuditContentRequest request) throws Exception {
        return AuditContentResponse.builder().build();
    }
}