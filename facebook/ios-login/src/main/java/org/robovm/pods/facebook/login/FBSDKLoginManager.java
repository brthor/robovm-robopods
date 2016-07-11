/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.facebook.login;

import java.util.List;

import org.robovm.apple.accounts.ACAccountCredentialRenewResult;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.VoidBlock2;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLoginManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKLoginManagerPtr extends Ptr<FBSDKLoginManager, FBSDKLoginManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKLoginManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKLoginManager() {}
    protected FBSDKLoginManager(long handle) { super(handle); }
    protected FBSDKLoginManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultAudience")
    public native FBSDKDefaultAudience getDefaultAudience();
    @Property(selector = "setDefaultAudience:")
    public native void setDefaultAudience(FBSDKDefaultAudience v);
    @Property(selector = "loginBehavior")
    public native FBSDKLoginBehavior getLoginBehavior();
    @Property(selector = "setLoginBehavior:")
    public native void setLoginBehavior(FBSDKLoginBehavior v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void logInWithReadPermissions(List<String> permissions, VoidBlock2<FBSDKLoginManagerLoginResult, NSError> handler) {
        logInWithReadPermissions(permissions, null, handler);
    }
    public void logInWithPublishPermissions(List<String> permissions, VoidBlock2<FBSDKLoginManagerLoginResult, NSError> handler) {
        logInWithPublishPermissions(permissions, null, handler);
    }
    /*<methods>*/
    @Method(selector = "logInWithReadPermissions:fromViewController:handler:")
    public native void logInWithReadPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> permissions, UIViewController fromViewController, @Block VoidBlock2<FBSDKLoginManagerLoginResult, NSError> handler);
    @Method(selector = "logInWithPublishPermissions:fromViewController:handler:")
    public native void logInWithPublishPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> permissions, UIViewController fromViewController, @Block VoidBlock2<FBSDKLoginManagerLoginResult, NSError> handler);
    @Method(selector = "logOut")
    public native void logOut();
    @Method(selector = "renewSystemCredentials:")
    public static native void renewSystemCredentials(@Block VoidBlock2<ACAccountCredentialRenewResult, NSError> handler);
    /*</methods>*/
}
