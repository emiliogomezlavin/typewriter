// This code is auto-generated by Segment Typewriter. Do not edit.
package com.segment.analytics;

import java.util.*;
import com.segment.analytics.Properties;
import android.support.annotation.NonNull;

public final class ExampleEvent {
    private Properties properties;

    private ExampleEvent(Properties properties) {
        this.properties = properties;
    }

    protected Properties toProperties() {
        return properties;
    }

    /**
     * Builder for {@link ExampleEvent}
     */
    public static class Builder {
        private Properties properties;

        /**
         * Builder for {@link ExampleEvent}
         */
        public Builder() {
            properties = new Properties();
        }

        /**
         * Optional any property
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalAny(final @NonNull Object optionalAny) {
            properties.putValue("optional any", optionalAny);
            return this;
        }

        /**
         * Optional array property
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalArray(final @NonNull List<OptionalArray> optionalArray) {
            properties.putValue("optional array", optionalArray);
            return this;
        }

        /**
         * Optional array (empty) property
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalArrayEmpty(final @NonNull List<Properties> optionalArrayEmpty) {
            properties.putValue("optional array (empty)", optionalArrayEmpty);
            return this;
        }

        /**
         * Optional boolean property
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalBoolean(final @NonNull Boolean optionalBoolean) {
            properties.putValue("optional boolean", optionalBoolean);
            return this;
        }

        /**
         * Optional integer property
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalInt(final @NonNull Long optionalInt) {
            properties.putValue("optional int", optionalInt);
            return this;
        }

        /**
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalNullableString(final @NonNull String optionalNullableString) {
            properties.putValue("optional nullable string", optionalNullableString);
            return this;
        }

        /**
         * Optional number property
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalNumber(final @NonNull Double optionalNumber) {
            properties.putValue("optional number", optionalNumber);
            return this;
        }

        /**
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalNumberOrString(final @NonNull NumberOrString optionalNumberOrString) {
            properties.putValue("optional number or string", optionalNumberOrString);
            return this;
        }

        /**
         * Optional object property
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalObject(final @NonNull OptionalObject optionalObject) {
            properties.putValue("optional object", optionalObject);
            return this;
        }

        /**
         * Optional object (empty) property
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalObjectEmpty(final @NonNull Map<String, Object> optionalObjectEmpty) {
            properties.putValue("optional object (empty)", optionalObjectEmpty);
            return this;
        }

        /**
         * Optional string property
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalString(final @NonNull String optionalString) {
            properties.putValue("optional string", optionalString);
            return this;
        }

        /**
         * Optional string regex property
         * This property is optional and not required to generate a valid ExampleEvent object
         */
        public Builder optionalStringRegex(final @NonNull String optionalStringRegex) {
            properties.putValue("optional string regex", optionalStringRegex);
            return this;
        }

        /**
         * Required any property
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredAny(final @NonNull Object requiredAny) {
            properties.putValue("required any", requiredAny);
            return this;
        }

        /**
         * Required array property
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredArray(final @NonNull List<RequiredArray> requiredArray) {
            properties.putValue("required array", requiredArray);
            return this;
        }

        /**
         * Required array (empty) property
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredArrayEmpty(final @NonNull List<Properties> requiredArrayEmpty) {
            properties.putValue("required array (empty)", requiredArrayEmpty);
            return this;
        }

        /**
         * Required boolean property
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredBoolean(final @NonNull Boolean requiredBoolean) {
            properties.putValue("required boolean", requiredBoolean);
            return this;
        }

        /**
         * Required integer property
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredInt(final @NonNull Long requiredInt) {
            properties.putValue("required int", requiredInt);
            return this;
        }

        /**
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredNullableString(final @NonNull String requiredNullableString) {
            properties.putValue("required nullable string", requiredNullableString);
            return this;
        }

        /**
         * Required number property
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredNumber(final @NonNull Double requiredNumber) {
            properties.putValue("required number", requiredNumber);
            return this;
        }

        /**
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredNumberOrString(final @NonNull NumberOrString requiredNumberOrString) {
            properties.putValue("required number or string", requiredNumberOrString);
            return this;
        }

        /**
         * Required object property
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredObject(final @NonNull RequiredObject requiredObject) {
            properties.putValue("required object", requiredObject);
            return this;
        }

        /**
         * Required object (empty) property
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredObjectEmpty(final @NonNull Map<String, Object> requiredObjectEmpty) {
            properties.putValue("required object (empty)", requiredObjectEmpty);
            return this;
        }

        /**
         * Required string property
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredString(final @NonNull String requiredString) {
            properties.putValue("required string", requiredString);
            return this;
        }

        /**
         * Required string regex property
         * This property is required to generate a valid ExampleEvent object
         */
        public Builder requiredStringRegex(final @NonNull String requiredStringRegex) {
            properties.putValue("required string regex", requiredStringRegex);
            return this;
        }

        /**
         * Build an instance of {@link ExampleEvent}
         * Performs runtime validation on the following required properties:
         *  - requiredAny
         *  - requiredArray
         *  - requiredArrayEmpty
         *  - requiredBoolean
         *  - requiredInt
         *  - requiredNullableString
         *  - requiredNumber
         *  - requiredNumberOrString
         *  - requiredObject
         *  - requiredObjectEmpty
         *  - requiredString
         *  - requiredStringRegex
         */
        public ExampleEvent build() {
            if (properties.get("required any") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredAny");
            }

            if (properties.get("required array") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredArray");
            }

            if (properties.get("required array (empty)") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredArrayEmpty");
            }

            if (properties.get("required boolean") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredBoolean");
            }

            if (properties.get("required int") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredInt");
            }

            if (properties.get("required nullable string") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredNullableString");
            }

            if (properties.get("required number") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredNumber");
            }

            if (properties.get("required number or string") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredNumberOrString");
            }

            if (properties.get("required object") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredObject");
            }

            if (properties.get("required object (empty)") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredObjectEmpty");
            }

            if (properties.get("required string") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredString");
            }

            if (properties.get("required string regex") == null) {
                throw new IllegalArgumentException("ExampleEvent missing required property: requiredStringRegex");
            }

            return new ExampleEvent(properties);
        }
    }
}
