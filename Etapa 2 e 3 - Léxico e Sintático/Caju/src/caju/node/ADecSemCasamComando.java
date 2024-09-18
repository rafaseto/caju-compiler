/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class ADecSemCasamComando extends PComando
{
    private PDecSemCasam _decSemCasam_;

    public ADecSemCasamComando()
    {
        // Constructor
    }

    public ADecSemCasamComando(
        @SuppressWarnings("hiding") PDecSemCasam _decSemCasam_)
    {
        // Constructor
        setDecSemCasam(_decSemCasam_);

    }

    @Override
    public Object clone()
    {
        return new ADecSemCasamComando(
            cloneNode(this._decSemCasam_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecSemCasamComando(this);
    }

    public PDecSemCasam getDecSemCasam()
    {
        return this._decSemCasam_;
    }

    public void setDecSemCasam(PDecSemCasam node)
    {
        if(this._decSemCasam_ != null)
        {
            this._decSemCasam_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decSemCasam_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decSemCasam_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decSemCasam_ == child)
        {
            this._decSemCasam_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._decSemCasam_ == oldChild)
        {
            setDecSemCasam((PDecSemCasam) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
