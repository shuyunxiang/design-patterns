package com.doudou.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator4 {

    // 功能提供
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }

    // 构造方法私有
    private IdGenerator4() {
    }

    // 内部实例化
    private static class SingletonHolder {
        private static final IdGenerator4 instance = new IdGenerator4();
    }

    // 提供接口
    public static IdGenerator4 getInstance() {
        return SingletonHolder.instance;
    }
}

