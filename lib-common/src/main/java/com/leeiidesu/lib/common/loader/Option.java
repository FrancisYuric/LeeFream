package com.leeiidesu.lib.common.loader;

import android.support.annotation.DrawableRes;

/**
 * _ Option _ Created by dgg on 2017/7/20.
 */

public class Option {
    private int round;

    private int placeholder;
    private int error;

    private boolean circleCrop;

    public static Builder builder() {
        return new Builder();
    }

    public boolean hasRound() {
        return round != 0;
    }


    public static class Builder {
        private Option mOption;

        private Builder() {
            mOption = new Option();
        }


        public Builder round(int round) {
            mOption.round = round;
            return this;
        }

        public Builder placeholder(@DrawableRes int placeholder) {
            mOption.placeholder = placeholder;
            return this;
        }

        public Builder error(@DrawableRes int error) {
            mOption.error = error;
            return this;
        }

        public Builder circleCrop() {
            mOption.circleCrop = true;
            return this;
        }

        public Option build() {
            return mOption;
        }
    }

    public int getRound() {
        return round;
    }

    public int getPlaceholder() {
        return placeholder;
    }

    public int getError() {
        return error;
    }

    public boolean isCircleCrop() {
        return circleCrop;
    }
}
