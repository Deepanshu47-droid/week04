package com.annotation.customcachingsystem;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    private static Map<String, Object> cache = new HashMap<>(); // Store method results in cache

    // Method to handle caching logic
    public static Object cacheMethodResult(Object obj, Method method, Object[] params) throws Exception {
        // Create a unique key based on method name and parameters
        String cacheKey = method.getName() + "-" + params[0];  // Simple cache key, assuming single parameter

        // Check if the result is in the cache
        if (cache.containsKey(cacheKey)) {
            System.out.println("Returning cached result for " + cacheKey);
            return cache.get(cacheKey); // Return cached result
        }

        // If not in cache, invoke the method and store the result in cache
        Object result = method.invoke(obj, params);
        cache.put(cacheKey, result); // Cache the result
        return result;
    }
}

