/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class TVazio extends Token
{
    public TVazio()
    {
        super.setText("vazio");
    }

    public TVazio(int line, int pos)
    {
        super.setText("vazio");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVazio(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVazio(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TVazio text.");
    }
}
