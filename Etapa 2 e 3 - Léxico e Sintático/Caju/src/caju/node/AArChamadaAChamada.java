/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AArChamadaAChamada extends PAChamada
{
    private TId _id_;
    private PAListaExp _aListaExp_;

    public AArChamadaAChamada()
    {
        // Constructor
    }

    public AArChamadaAChamada(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PAListaExp _aListaExp_)
    {
        // Constructor
        setId(_id_);

        setAListaExp(_aListaExp_);

    }

    @Override
    public Object clone()
    {
        return new AArChamadaAChamada(
            cloneNode(this._id_),
            cloneNode(this._aListaExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArChamadaAChamada(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public PAListaExp getAListaExp()
    {
        return this._aListaExp_;
    }

    public void setAListaExp(PAListaExp node)
    {
        if(this._aListaExp_ != null)
        {
            this._aListaExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aListaExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._aListaExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._aListaExp_ == child)
        {
            this._aListaExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._aListaExp_ == oldChild)
        {
            setAListaExp((PAListaExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
