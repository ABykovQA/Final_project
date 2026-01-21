package datatest;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    private static final ThreadLocal<Map<String, Object>> contextHolder =
            ThreadLocal.withInitial(HashMap::new);

    public void setContext(String key, Object value) {
        contextHolder.get().put(key, value);
    }

    public Object getContext(String key) {
        return contextHolder.get().get(key);
    }

    // Очистка после сценария (вызывать в @After)
    public static void clear() {
        contextHolder.remove();
    }
}

