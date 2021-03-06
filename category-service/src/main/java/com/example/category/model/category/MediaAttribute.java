/*
 * #region
 * category-service
 * %%
 * Copyright (C) 2017 - 2018 Etilize
 * %%
 * NOTICE: All information contained herein is, and remains the property of ETILIZE.
 * The intellectual and technical concepts contained herein are proprietary to
 * ETILIZE and may be covered by U.S. and Foreign Patents, patents in process, and
 * are protected by trade secret or copyright law. Dissemination of this information
 * or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from ETILIZE. Access to the source code contained herein
 * is hereby forbidden to anyone except current ETILIZE employees, managers or
 * contractors who have executed Confidentiality and Non-disclosure agreements
 * explicitly covering such access.
 *
 * The copyright notice above does not evidence any actual or intended publication
 * or disclosure of this source code, which includes information that is confidential
 * and/or proprietary, and is a trade secret, of ETILIZE. ANY REPRODUCTION, MODIFICATION,
 * DISTRIBUTION, PUBLIC PERFORMANCE, OR PUBLIC DISPLAY OF OR THROUGH USE OF THIS
 * SOURCE CODE WITHOUT THE EXPRESS WRITTEN CONSENT OF ETILIZE IS STRICTLY PROHIBITED,
 * AND IN VIOLATION OF APPLICABLE LAWS AND INTERNATIONAL TREATIES. THE RECEIPT
 * OR POSSESSION OF THIS SOURCE CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR
 * IMPLY ANY RIGHTS TO REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO
 * MANUFACTURE, USE, OR SELL ANYTHING THAT IT MAY DESCRIBE, IN WHOLE OR IN PART.
 * #endregion
 */

package com.example.category.model.category;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class MediaAttribute {

    @NotBlank(message = "attributeId is required")
    private String attributeId;

    @NotNull(message = "source is required")
    private Source source;

    @NotNull(message = "order is required")
    private Integer order;

    /**
     * Constructor {@link MediaAttribute}
     * @param attributeId media attribute Id
     * @param source media attribute source
     * @param order stores order of attribute
     */
    @JsonCreator
    public MediaAttribute(@JsonProperty("attributeId") final String attributeId,
                          @JsonProperty("source") final Source source,
                          @JsonProperty("order") final Integer order) {
        this.attributeId = attributeId;
        this.source = source;
        this.order = order;
    }

    /**
     * Return media attributes ID
     * @return attributeId
     */
    public String getAttributeId() {
        return attributeId;
    }

    /**
     * Return media attributes source
     * @return {@link Source}
     */
    public Source getSource() {
        return source;
    }

    /**
     * @return the order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Set attribute id.
     *
     * @param attributeId {@link String} attribute id.
     */
    public void setAttributeId(final String attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * Set source.
     *
     * @param source {@link String} source
     */
    public void setSource(final Source source) {
        this.source = source;
    }

    /**
     * Set order.
     *
     * @param order {@link String} order.
     */
    public void setOrder(final Integer order) {
        this.order = order;
    }

    @Override
    public final boolean equals(final Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof MediaAttribute)) {
            return false;
        }

        final MediaAttribute mediaAttribute = (MediaAttribute) object;

        return new EqualsBuilder() //
                .append(attributeId, mediaAttribute.getAttributeId()) //
                .isEquals();
    }

    @Override
    public final int hashCode() {
        return new HashCodeBuilder() //
                .append(attributeId) //
                .hashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this) //
                .append("AttributeId", attributeId) //
                .append("Source", source) //
                .append("Order", order) //
                .toString();
    }

}
