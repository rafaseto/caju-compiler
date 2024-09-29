/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AArTipoBaseATipo extends PATipo
{
    private PATipoBase _aTipoBase_;

    public AArTipoBaseATipo()
    {
        // Constructor
    }

    public AArTipoBaseATipo(
        @SuppressWarnings("hiding") PATipoBase _aTipoBase_)
    {
        // Constructor
        setATipoBase(_aTipoBase_);

    }

    @Override
    public Object clone()
    {
        return new AArTipoBaseATipo(
            cloneNode(this._aTipoBase_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArTipoBaseATipo(this);
    }

    public PATipoBase getATipoBase()
    {
        return this._aTipoBase_;
    }

    public void setATipoBase(PATipoBase node)
    {
        if(this._aTipoBase_ != null)
        {
            this._aTipoBase_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aTipoBase_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aTipoBase_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aTipoBase_ == child)
        {
            this._aTipoBase_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aTipoBase_ == oldChild)
        {
            setATipoBase((PATipoBase) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
