/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AArChamadaAChamada extends PAChamada
{
    private TId _id_;
    private PAListaExp _listaExp_;

    public AArChamadaAChamada()
    {
        // Constructor
    }

    public AArChamadaAChamada(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PAListaExp _listaExp_)
    {
        // Constructor
        setId(_id_);

        setListaExp(_listaExp_);

    }

    @Override
    public Object clone()
    {
        return new AArChamadaAChamada(
            cloneNode(this._id_),
            cloneNode(this._listaExp_));
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

    public PAListaExp getListaExp()
    {
        return this._listaExp_;
    }

    public void setListaExp(PAListaExp node)
    {
        if(this._listaExp_ != null)
        {
            this._listaExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._listaExp_);
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

        if(this._listaExp_ == child)
        {
            this._listaExp_ = null;
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

        if(this._listaExp_ == oldChild)
        {
            setListaExp((PAListaExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
