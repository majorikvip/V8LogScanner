package org.v8LogScanner.cmdScanner;

import org.v8LogScanner.cmdAppl.CmdCommand;

public class CmdWriteToCfg implements CmdCommand {
    @Override
    public String getTip() {
        return "";
    }

    @Override
    public void execute() {
        V8LogScannerAppl.instance().logBuilder.writeToXmlFile();
    }
}
