package com.ccb.log4j2.demo.lookup;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.StrLookup;

@Plugin(name = "data", category = StrLookup.CATEGORY)
public class DataContextLookup implements StrLookup {
    @Override
    public String lookup(String s) {
        return DataContext.getContext().get(s);
    }

    @Override
    public String lookup(LogEvent logEvent, String s) {
        return this.lookup(s);
    }
}
