class Vote < ApplicationRecord
  belongs_to :entry
  belongs_to :member

  validate do
    error.add(:base, :invalid) unless member&.votable_for?(entry)
  end
end
