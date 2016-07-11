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

import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.uikit.UIView;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKTooltipView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKTooltipViewPtr extends Ptr<FBSDKTooltipView, FBSDKTooltipViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKTooltipView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKTooltipView() {}
    protected FBSDKTooltipView(long handle) { super(handle); }
    protected FBSDKTooltipView(SkipInit skipInit) { super(skipInit); }

    public FBSDKTooltipView(String tagline, String message, FBSDKTooltipColorStyle colorStyle) { super((SkipInit) null); initObject(init(tagline, message, colorStyle)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "displayDuration")
    public native double getDisplayDuration();
    @Property(selector = "setDisplayDuration:")
    public native void setDisplayDuration(double v);
    @Property(selector = "colorStyle")
    public native FBSDKTooltipColorStyle getColorStyle();
    @Property(selector = "setColorStyle:")
    public native void setColorStyle(FBSDKTooltipColorStyle v);
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "tagline")
    public native String getTagline();
    @Property(selector = "setTagline:")
    public native void setTagline(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTagline:message:colorStyle:")
    protected native @Pointer long init(String tagline, String message, FBSDKTooltipColorStyle colorStyle);
    @Method(selector = "presentFromView:")
    public native void presentFromView(UIView anchorView);
    @Method(selector = "presentInView:withArrowPosition:direction:")
    public native void presentInView(UIView view, @ByVal CGPoint arrowPosition, FBSDKTooltipViewArrowDirection arrowDirection);
    @Method(selector = "dismiss")
    public native void dismiss();
    /*</methods>*/
}
