/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AArVarAExp extends PAExp
{
    private PAVar _aVar_;

    public AArVarAExp()
    {
        // Constructor
    }

    public AArVarAExp(
        @SuppressWarnings("hiding") PAVar _aVar_)
    {
        // Constructor
        setAVar(_aVar_);

    }

    @Override
    public Object clone()
    {
        return new AArVarAExp(
            cloneNode(this._aVar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArVarAExp(this);
    }

    public PAVar getAVar()
    {
        return this._aVar_;
    }

    public void setAVar(PAVar node)
    {
        if(this._aVar_ != null)
        {
            this._aVar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aVar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aVar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aVar_ == child)
        {
            this._aVar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aVar_ == oldChild)
        {
            setAVar((PAVar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
