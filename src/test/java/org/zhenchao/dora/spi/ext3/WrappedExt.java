package org.zhenchao.dora.spi.ext3;

import org.zhenchao.dora.spi.SPI;

/**
 * @author zhenchao.wang 2017-12-30 13:01
 * @version 1.0.0
 */
@SPI
public interface WrappedExt {

    String echo(int pt, String s);

}
