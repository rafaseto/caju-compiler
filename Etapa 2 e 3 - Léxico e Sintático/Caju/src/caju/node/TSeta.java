/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class TSeta extends Token
{
    public TSeta()
    {
        super.setText("->");
    }

    public TSeta(int line, int pos)
    {
        super.setText("->");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSeta(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSeta(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSeta text.");
    }
}
