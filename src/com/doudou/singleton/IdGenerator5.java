package com.doudou.singleton;

import java.util.concurrent.atomic.AtomicLong;

public enum IdGenerator5 {

    INSTANCE;
    // εθ½ζδΎ
    private AtomicLong id = new AtomicLong(0);
    public long getId() {
        return id.incrementAndGet();
    }
}

