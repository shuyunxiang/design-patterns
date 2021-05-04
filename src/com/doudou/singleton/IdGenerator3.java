package com.doudou.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator3 {
    // 功能提供
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }

    // 构造方法私有
    private IdGenerator3() {
    }

    // 内部实例化
    private static IdGenerator3 instance;

    // 提供接口
    public static IdGenerator3 getInstance() {
        if (instance == null) {
            synchronized (IdGenerator3.class) {
                if (instance == null) {
                    instance = new IdGenerator3();
                }
            }
        }

        return instance;
    }
}

