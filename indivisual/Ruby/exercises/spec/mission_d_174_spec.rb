require './app/mission_d_174.rb'

describe '料金チェック' do
  describe '出力結果のテスト' do
    let(:missionD174) { MissionD174.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "59\n" }
      expect($stdout).to receive(:puts).with(88500)
      missionD174.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "76\n" }
      expect($stdout).to receive(:puts).with(114000)
      missionD174.run
    end
  end
end
