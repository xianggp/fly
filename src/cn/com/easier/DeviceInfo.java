package cn.com.easier;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;

public class DeviceInfo extends CordovaPlugin {

    public DeviceInfo(){
    }

    public String deviceImeiNumber(){
        TelephonyManager tManager = (TelephonyManager)cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);            
        return tManager.getDeviceId();
    }
    
    public String devicePhoneNumber(){
    	TelephonyManager tm = (TelephonyManager)cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
    	return tm.getLine1Number();
    }
    public String deviceSimSerialNumber(){
    	TelephonyManager tm = (TelephonyManager)cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
    	return tm.getSimSerialNumber();
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("imeiNumber")) {
            callbackContext.success(this.deviceImeiNumber());
            return true;
        } 
        else if(action.equals("phoneNumber")){
        	callbackContext.success(this.devicePhoneNumber());
            return true;
        }else if(action.equals("phoneSim")){
        	callbackContext.success(this.deviceSimSerialNumber());
            return true;
        }else{
        	return false;
        }
    } 
}
