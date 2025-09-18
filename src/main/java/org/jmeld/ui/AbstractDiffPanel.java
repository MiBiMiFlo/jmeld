package org.jmeld.ui;

import org.jmeld.diff.JMDelta;
import org.jmeld.diff.JMRevision;
import org.jmeld.ui.search.SearchCommand;
import org.jmeld.ui.text.JMDocumentEvent;

public abstract class AbstractDiffPanel extends AbstractContentPanel
{
    public abstract JMRevision getCurrentRevision() ;
    
    public abstract SearchCommand getSearchCommand();
    
    public abstract boolean revisionChanged(JMDocumentEvent de);
    
    public abstract void setSelectedPanel(FilePanel fp);
    
    public abstract void doGotoDelta(JMDelta delta);
    public abstract void doGotoLine(int line);
    
    public abstract void toNextDelta(boolean next);
    public abstract JMDelta getSelectedDelta() ;
    public abstract void setSelectedDelta(JMDelta delta) ;
    public abstract void runChange(int fromPanelIndex, int toPanelIndex, boolean shift);
    public abstract void runDelete(int fromPanelIndex, int toPanelIndex);
    public abstract FilePanel getFilePanel(int index);
    
    public abstract void diff();
}
