/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AArIndexadaAVar extends PAVar
{
    private PAVar _aVar_;
    private PAExp _aExp_;

    public AArIndexadaAVar()
    {
        // Constructor
    }

    public AArIndexadaAVar(
        @SuppressWarnings("hiding") PAVar _aVar_,
        @SuppressWarnings("hiding") PAExp _aExp_)
    {
        // Constructor
        setAVar(_aVar_);

        setAExp(_aExp_);

    }

    @Override
    public Object clone()
    {
        return new AArIndexadaAVar(
            cloneNode(this._aVar_),
            cloneNode(this._aExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArIndexadaAVar(this);
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

    public PAExp getAExp()
    {
        return this._aExp_;
    }

    public void setAExp(PAExp node)
    {
        if(this._aExp_ != null)
        {
            this._aExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aVar_)
            + toString(this._aExp_);
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

        if(this._aExp_ == child)
        {
            this._aExp_ = null;
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

        if(this._aExp_ == oldChild)
        {
            setAExp((PAExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
