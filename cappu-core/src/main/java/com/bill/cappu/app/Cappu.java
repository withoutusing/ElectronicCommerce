package com.bill.cappu.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * Created by acer on 2017/11/22.
 */

public final class Cappu {
    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String,Object> getConfigurations(){
        return Configurator.getInstance().getCappuConfigs();
    }
}
