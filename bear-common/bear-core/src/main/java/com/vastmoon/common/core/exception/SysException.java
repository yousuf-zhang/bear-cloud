package com.vastmoon.common.core.exception;

import com.vastmoon.common.client.dto.RestCode;
import com.vastmoon.common.core.exception.framework.BaseException;
import com.vastmoon.common.core.exception.framework.FrameworkCode;

/**
 * <p> ClassName: SysException
 * <p> Description: 系统异常
 *
 * @author yousuf 2020/11/6
 */
public class SysException extends BaseException {
    private static final long serialVersionUID = 7568468572436346758L;

    public SysException(String errorMessage) {
        super(errorMessage);
        this.setCode(FrameworkCode.SYS_ERROR);
    }

    public SysException(String errorMessage, Throwable e) {
        super(errorMessage, e);
        this.setCode(FrameworkCode.SYS_ERROR);
    }

    public SysException(RestCode code, String errorMessage) {
        super(errorMessage);
        this.setCode(code);
    }
}
