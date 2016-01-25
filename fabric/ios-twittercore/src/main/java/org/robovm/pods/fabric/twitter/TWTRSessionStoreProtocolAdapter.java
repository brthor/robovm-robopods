/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.twitter;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.accounts.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRSessionStoreProtocolAdapter/*</name>*/ 
    extends /*<extends>*/TWTRUserSessionStoreAdapter/*</extends>*/ 
    /*<implements>*/implements TWTRSessionStoreProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("authConfig")
    public TWTRAuthConfig getAuthConfig() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
    
    @Override
    public void fetchGuestSession(VoidBlock2<TWTRGuestSession, NSError> completion) {
    }

    @Override
    public void refreshSessionClass(Class<? extends TWTRAuthSession> sessionClass, String sessionID,
            VoidBlock2<TWTRAuthSession, NSError> completion) {
    }

    @Override
    public boolean isSessionExpired(TWTRAuthSession session, NSHTTPURLResponse response) {
        return false;
    }

    @Override
    public boolean isSessionExpired(TWTRAuthSession session, NSError error) {
        return false;
    }
}