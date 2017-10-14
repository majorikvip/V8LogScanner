package org.v8LogScanner.cmdScanner;

import org.v8LogScanner.cmdAppl.CmdCommand;
import org.v8LogScanner.rgx.ScanProfile;

public class CmdGetRphostExcp implements CmdCommand {

    public String getTip() {
        return "";
    }

    public void execute() {
        V8LogScannerAppl appl = V8LogScannerAppl.instance();
        ScanProfile.buildRphostExcp(appl.profile);
    }
}
