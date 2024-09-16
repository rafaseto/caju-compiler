/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorIgualExp extends PExp
{
    private PExp _esq_;
    private TMaiorIgual _maiorIgual_;
    private PExp _dir_;

    public AMaiorIgualExp()
    {
        // Constructor
    }

    public AMaiorIgualExp(
        @SuppressWarnings("hiding") PExp _esq_,
        @SuppressWarnings("hiding") TMaiorIgual _maiorIgual_,
        @SuppressWarnings("hiding") PExp _dir_)
    {
        // Constructor
        setEsq(_esq_);

        setMaiorIgual(_maiorIgual_);

        setDir(_dir_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorIgualExp(
            cloneNode(this._esq_),
            cloneNode(this._maiorIgual_),
            cloneNode(this._dir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorIgualExp(this);
    }

    public PExp getEsq()
    {
        return this._esq_;
    }

    public void setEsq(PExp node)
    {
        if(this._esq_ != null)
        {
            this._esq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esq_ = node;
    }

    public TMaiorIgual getMaiorIgual()
    {
        return this._maiorIgual_;
    }

    public void setMaiorIgual(TMaiorIgual node)
    {
        if(this._maiorIgual_ != null)
        {
            this._maiorIgual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maiorIgual_ = node;
    }

    public PExp getDir()
    {
        return this._dir_;
    }

    public void setDir(PExp node)
    {
        if(this._dir_ != null)
        {
            this._dir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esq_)
            + toString(this._maiorIgual_)
            + toString(this._dir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esq_ == child)
        {
            this._esq_ = null;
            return;
        }

        if(this._maiorIgual_ == child)
        {
            this._maiorIgual_ = null;
            return;
        }

        if(this._dir_ == child)
        {
            this._dir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esq_ == oldChild)
        {
            setEsq((PExp) newChild);
            return;
        }

        if(this._maiorIgual_ == oldChild)
        {
            setMaiorIgual((TMaiorIgual) newChild);
            return;
        }

        if(this._dir_ == oldChild)
        {
            setDir((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
