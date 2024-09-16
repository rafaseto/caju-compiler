/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AChamada extends PChamada
{
    private TId _id_;
    private TAbreParenteses _abreParenteses_;
    private PListaExp _listaExp_;
    private TFechaParenteses _fechaParenteses_;

    public AChamada()
    {
        // Constructor
    }

    public AChamada(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TAbreParenteses _abreParenteses_,
        @SuppressWarnings("hiding") PListaExp _listaExp_,
        @SuppressWarnings("hiding") TFechaParenteses _fechaParenteses_)
    {
        // Constructor
        setId(_id_);

        setAbreParenteses(_abreParenteses_);

        setListaExp(_listaExp_);

        setFechaParenteses(_fechaParenteses_);

    }

    @Override
    public Object clone()
    {
        return new AChamada(
            cloneNode(this._id_),
            cloneNode(this._abreParenteses_),
            cloneNode(this._listaExp_),
            cloneNode(this._fechaParenteses_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamada(this);
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

    public TAbreParenteses getAbreParenteses()
    {
        return this._abreParenteses_;
    }

    public void setAbreParenteses(TAbreParenteses node)
    {
        if(this._abreParenteses_ != null)
        {
            this._abreParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreParenteses_ = node;
    }

    public PListaExp getListaExp()
    {
        return this._listaExp_;
    }

    public void setListaExp(PListaExp node)
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

    public TFechaParenteses getFechaParenteses()
    {
        return this._fechaParenteses_;
    }

    public void setFechaParenteses(TFechaParenteses node)
    {
        if(this._fechaParenteses_ != null)
        {
            this._fechaParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaParenteses_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._abreParenteses_)
            + toString(this._listaExp_)
            + toString(this._fechaParenteses_);
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

        if(this._abreParenteses_ == child)
        {
            this._abreParenteses_ = null;
            return;
        }

        if(this._listaExp_ == child)
        {
            this._listaExp_ = null;
            return;
        }

        if(this._fechaParenteses_ == child)
        {
            this._fechaParenteses_ = null;
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

        if(this._abreParenteses_ == oldChild)
        {
            setAbreParenteses((TAbreParenteses) newChild);
            return;
        }

        if(this._listaExp_ == oldChild)
        {
            setListaExp((PListaExp) newChild);
            return;
        }

        if(this._fechaParenteses_ == oldChild)
        {
            setFechaParenteses((TFechaParenteses) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
