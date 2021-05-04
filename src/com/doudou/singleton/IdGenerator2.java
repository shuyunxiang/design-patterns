package com.doudou.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator2 {

    // 功能提供
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }

    // 构造方法私有
    private IdGenerator2() {
    }

    // 内部实例化
    private static IdGenerator2 instance;

    // 提供接口
    public static synchronized IdGenerator2 getInstance() {
        if (instance == null) {
            instance = new IdGenerator2();
        }

        return instance;
    }


}

