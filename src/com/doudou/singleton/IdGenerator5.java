package com.doudou.singleton;

import java.util.concurrent.atomic.AtomicLong;

public enum IdGenerator5 {

    INSTANCE;
    // 功能提供
    private AtomicLong id = new AtomicLong(0);
    public long getId() {
        return id.incrementAndGet();
    }
}

