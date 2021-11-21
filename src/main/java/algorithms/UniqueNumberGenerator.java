package algorithms;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

public class UniqueNumberGenerator {
    private final AtomicLong uniqueNumber = new AtomicLong(0);
    private final ConcurrentMap<Long, AtomicLong> clientNumberMap = new ConcurrentHashMap<>();

    public long generateUniqueNumber() {
        return uniqueNumber.incrementAndGet();
    }

    public long generateUniqueNumber(long clientId) {
        clientNumberMap.putIfAbsent(clientId, new AtomicLong(0));
        return clientNumberMap.get(clientId).incrementAndGet();
    }

    public long getUniqueNumber() {
        return uniqueNumber.get();
    }

    public long getUniqueNumber(long clientId) {
        AtomicLong clientNumber = clientNumberMap.get(clientId);
        return clientNumber != null ? clientNumber.get() : -1;
    }
}
