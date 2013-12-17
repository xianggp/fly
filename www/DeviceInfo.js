cordova.define("cordova/plugin/DeviceInfo",
  function(require, exports, module) {
    var exec = require("cordova/exec");

    function DeviceInfo() {}

        DeviceInfo.prototype.imeiNumber = function(win, fail) {
            return cordova.exec(
                    function (args) { if(win !== undefined) { win(args); } },
                    function (args) { if(fail !== undefined) { fail(args); } },
                    "DeviceInfo", "imeiNumber", []);
        };
        DeviceInfo.prototype.phoneNumber = function(win, fail) {
            return cordova.exec(
                    function (args) { if(win !== undefined) { win(args); } },
                    function (args) { if(fail !== undefined) { fail(args); } },
                    "DeviceInfo", "phoneNumber", []);
        };
        DeviceInfo.prototype.phoneSim = function(win, fail) {
            return cordova.exec(
                    function (args) { if(win !== undefined) { win(args); } },
                    function (args) { if(fail !== undefined) { fail(args); } },
                    "DeviceInfo", "phoneSim", []);
        };
  });
  
  if(!window.plugins) {
    window.plugins = {};
    }
    if (!window.plugins.DeviceInfo) {
        window.plugins.DeviceInfo = cordova.require("cordova/plugin/DeviceInfo");
    }



