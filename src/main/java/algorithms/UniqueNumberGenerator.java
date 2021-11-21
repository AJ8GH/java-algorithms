package algorithms;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class UniqueNumberGenerator {
    private final AtomicLong uniqueNumber = new AtomicLong(0);
    private final ConcurrentHashMap<Long, AtomicLong> clientNumberMap = new ConcurrentHashMap<>();

    public long generateUniqueNumber() {
        return uniqueNumber.getAndIncrement();
    }

    public long generateUniqueNumber(long clientId) {
        AtomicLong clientNumber = clientNumberMap.get(clientId);
        if (clientNumber == null) {
            clientNumber = new AtomicLong(0);
            clientNumberMap.put(clientId, clientNumber);
        }
        return clientNumber.incrementAndGet();
    }

    public long getUniqueNumber() {
        return uniqueNumber.get();
    }

    public long getUniqueNumber(long clientId) {
        AtomicLong clientNumber = clientNumberMap.get(clientId);
        return clientNumber != null ? clientNumber.get() : -1;
    }
}
