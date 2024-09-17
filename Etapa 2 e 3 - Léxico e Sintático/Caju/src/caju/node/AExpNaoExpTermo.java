/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AExpNaoExpTermo extends PExpTermo
{
    private PExpNao _expNao_;

    public AExpNaoExpTermo()
    {
        // Constructor
    }

    public AExpNaoExpTermo(
        @SuppressWarnings("hiding") PExpNao _expNao_)
    {
        // Constructor
        setExpNao(_expNao_);

    }

    @Override
    public Object clone()
    {
        return new AExpNaoExpTermo(
            cloneNode(this._expNao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpNaoExpTermo(this);
    }

    public PExpNao getExpNao()
    {
        return this._expNao_;
    }

    public void setExpNao(PExpNao node)
    {
        if(this._expNao_ != null)
        {
            this._expNao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expNao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expNao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expNao_ == child)
        {
            this._expNao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expNao_ == oldChild)
        {
            setExpNao((PExpNao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
